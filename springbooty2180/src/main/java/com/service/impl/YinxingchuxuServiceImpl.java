package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YinxingchuxuDao;
import com.entity.YinxingchuxuEntity;
import com.service.YinxingchuxuService;
import com.entity.vo.YinxingchuxuVO;
import com.entity.view.YinxingchuxuView;

@Service("yinxingchuxuService")
public class YinxingchuxuServiceImpl extends ServiceImpl<YinxingchuxuDao, YinxingchuxuEntity> implements YinxingchuxuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinxingchuxuEntity> page = this.selectPage(
                new Query<YinxingchuxuEntity>(params).getPage(),
                new EntityWrapper<YinxingchuxuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinxingchuxuEntity> wrapper) {
		  Page<YinxingchuxuView> page =new Query<YinxingchuxuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinxingchuxuVO> selectListVO(Wrapper<YinxingchuxuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinxingchuxuVO selectVO(Wrapper<YinxingchuxuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinxingchuxuView> selectListView(Wrapper<YinxingchuxuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinxingchuxuView selectView(Wrapper<YinxingchuxuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
