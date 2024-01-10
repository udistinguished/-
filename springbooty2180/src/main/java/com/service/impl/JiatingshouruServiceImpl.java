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


import com.dao.JiatingshouruDao;
import com.entity.JiatingshouruEntity;
import com.service.JiatingshouruService;
import com.entity.vo.JiatingshouruVO;
import com.entity.view.JiatingshouruView;

@Service("jiatingshouruService")
public class JiatingshouruServiceImpl extends ServiceImpl<JiatingshouruDao, JiatingshouruEntity> implements JiatingshouruService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiatingshouruEntity> page = this.selectPage(
                new Query<JiatingshouruEntity>(params).getPage(),
                new EntityWrapper<JiatingshouruEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiatingshouruEntity> wrapper) {
		  Page<JiatingshouruView> page =new Query<JiatingshouruView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiatingshouruVO> selectListVO(Wrapper<JiatingshouruEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiatingshouruVO selectVO(Wrapper<JiatingshouruEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiatingshouruView> selectListView(Wrapper<JiatingshouruEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiatingshouruView selectView(Wrapper<JiatingshouruEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
