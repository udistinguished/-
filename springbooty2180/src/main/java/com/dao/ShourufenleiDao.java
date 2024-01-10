package com.dao;

import com.entity.ShourufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShourufenleiVO;
import com.entity.view.ShourufenleiView;


/**
 * 收入分类
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface ShourufenleiDao extends BaseMapper<ShourufenleiEntity> {
	
	List<ShourufenleiVO> selectListVO(@Param("ew") Wrapper<ShourufenleiEntity> wrapper);
	
	ShourufenleiVO selectVO(@Param("ew") Wrapper<ShourufenleiEntity> wrapper);
	
	List<ShourufenleiView> selectListView(@Param("ew") Wrapper<ShourufenleiEntity> wrapper);

	List<ShourufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShourufenleiEntity> wrapper);
	
	ShourufenleiView selectView(@Param("ew") Wrapper<ShourufenleiEntity> wrapper);
	
}
