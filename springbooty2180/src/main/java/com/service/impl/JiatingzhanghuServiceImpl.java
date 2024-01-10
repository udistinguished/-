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


import com.dao.JiatingzhanghuDao;
import com.entity.FamilyAccountEntity;
import com.service.JiatingzhanghuService;
import com.entity.vo.FamilyAccountVO;
import com.entity.view.FamilyAccountView;

@Service("jiatingzhanghuService")
public class JiatingzhanghuServiceImpl extends ServiceImpl<JiatingzhanghuDao, FamilyAccountEntity> implements JiatingzhanghuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FamilyAccountEntity> page = this.selectPage(
                new Query<FamilyAccountEntity>(params).getPage(),
                new EntityWrapper<FamilyAccountEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FamilyAccountEntity> wrapper) {
		  Page<FamilyAccountView> page =new Query<FamilyAccountView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FamilyAccountVO> selectListVO(Wrapper<FamilyAccountEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FamilyAccountVO selectVO(Wrapper<FamilyAccountEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FamilyAccountView> selectListView(Wrapper<FamilyAccountEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FamilyAccountView selectView(Wrapper<FamilyAccountEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
