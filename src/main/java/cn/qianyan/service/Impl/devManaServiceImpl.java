package cn.qianyan.service.Impl;

import cn.qianyan.beans.Device;
import cn.qianyan.beans.User;
import cn.qianyan.dao.devManaDao;
import cn.qianyan.service.devManaService;
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
public class devManaServiceImpl implements devManaService {

    @Autowired
    private devManaDao devManaDao;


    @Override
    public pageBean selectAllDev(Map<Object,Object> map) {
        int currentCount = 15;
        pageBean pageBean = new pageBean();
        //封装当前页
        pageBean.setCurrentPage((Integer) map.get("Page_number"));
        //当前页显示的条数
        pageBean.setCurrentCount(currentCount);
        //获取数据总条数
        int totalCount = devManaDao.selectAllCount(map);
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
        List<User> persons = devManaDao.selectAllDev(map);
        pageBean.setLists(persons);
        return pageBean;
    }
    @Override
    public int addDev(Device device) {
        int i = devManaDao.addDev(device);
        return i;
    }

    @Override
    public int updateDev(Device device) {
        int i = devManaDao.updateDev(device);
        return i;
    }

    @Override
    public int deleteDev(Device device) {
        int i = devManaDao.deleteDev(device);
        return i;
    }
}
