package com.dao;

import com.entity.JiatingshouruEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiatingshouruVO;
import com.entity.view.JiatingshouruView;


/**
 * 家庭收入
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface JiatingshouruDao extends BaseMapper<JiatingshouruEntity> {
	
	List<JiatingshouruVO> selectListVO(@Param("ew") Wrapper<JiatingshouruEntity> wrapper);
	
	JiatingshouruVO selectVO(@Param("ew") Wrapper<JiatingshouruEntity> wrapper);
	
	List<JiatingshouruView> selectListView(@Param("ew") Wrapper<JiatingshouruEntity> wrapper);

	List<JiatingshouruView> selectListView(Pagination page,@Param("ew") Wrapper<JiatingshouruEntity> wrapper);
	
	JiatingshouruView selectView(@Param("ew") Wrapper<JiatingshouruEntity> wrapper);
	
}
