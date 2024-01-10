package com.dao;

import com.entity.FamilyAccountEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FamilyAccountVO;
import com.entity.view.FamilyAccountView;


/**
 * 家庭账户
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface JiatingzhanghuDao extends BaseMapper<FamilyAccountEntity> {
	
	List<FamilyAccountVO> selectListVO(@Param("ew") Wrapper<FamilyAccountEntity> wrapper);
	
	FamilyAccountVO selectVO(@Param("ew") Wrapper<FamilyAccountEntity> wrapper);
	
	List<FamilyAccountView> selectListView(@Param("ew") Wrapper<FamilyAccountEntity> wrapper);

	List<FamilyAccountView> selectListView(Pagination page, @Param("ew") Wrapper<FamilyAccountEntity> wrapper);
	
	FamilyAccountView selectView(@Param("ew") Wrapper<FamilyAccountEntity> wrapper);
	
}
