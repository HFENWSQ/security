package cn.qianyan.service.Impl;

import cn.qianyan.beans.User;
import cn.qianyan.dao.PerManaDao;
import cn.qianyan.service.PerMangeService;
import cn.qianyan.utils.pageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author:
 * @createDate:
 * @description:
 */
@Service
public class PerMangeServiceImpl implements PerMangeService{

    @Autowired
    private PerManaDao perManaDao;


    @Override
    public pageBean selectAll(Map<Object,Object> map) {
        int currentCount = 15;
        pageBean pageBean = new pageBean();
        //封装当前页
        pageBean.setCurrentPage((Integer) map.get("Page_number"));
        //当前页显示的条数
        pageBean.setCurrentCount(currentCount);
        //获取数据总条数
        int totalCount = perManaDao.selectAllCount(map);
        pageBean.setTotalCount(totalCount);
        //总页数private int totalPage;
        /*
         * 总条数		当前页显示的条数   	总页数
         * 10	           	4				3
         * 11	        	4				3
         * 12	        	4				3
         * 13	        	4				4
         *
         * 公式：总页数=Math.ceil(总条数/当前显示的条数)
         *
         */
        int totalPage = (int) Math.ceil(1.0 * totalCount / currentCount);
        pageBean.setTotalPage(totalPage);
        //每页显示的数据
        /*
         * 页数与limit起始索引的关系
         * 例如 每页显示4条
         * 页数		其实索引		每页显示条数
         * 1		0			4
         * 2		4			4
         * 3		8			4
         * 4		12			4
         *
         * 索引index = (当前页数-1)*每页显示的条数
         *
         */
        int index = ((Integer) map.get("Page_number")-1)*currentCount;
        map.put("index",index);
        map.put("currentCount",currentCount);
        List<User> persons = perManaDao.selectAll(map);
        pageBean.setLists(persons);
        return pageBean;
    }

    @Override
    public int addPers(User user) {
        int i = perManaDao.addPers(user);
        return i;
    }

    @Override
    public int updatePers(User user) {
        int i = perManaDao.updatePers(user);
        return i;
    }

    @Override
    public int deletePers(User user) {
        int i = perManaDao.deletePers(user);
        return i;
    }
}
