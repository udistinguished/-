package com.dao;

import com.entity.ZhichufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhichufenleiVO;
import com.entity.view.ZhichufenleiView;


/**
 * 支出分类
 * 
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface ZhichufenleiDao extends BaseMapper<ZhichufenleiEntity> {
	
	List<ZhichufenleiVO> selectListVO(@Param("ew") Wrapper<ZhichufenleiEntity> wrapper);
	
	ZhichufenleiVO selectVO(@Param("ew") Wrapper<ZhichufenleiEntity> wrapper);
	
	List<ZhichufenleiView> selectListView(@Param("ew") Wrapper<ZhichufenleiEntity> wrapper);

	List<ZhichufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhichufenleiEntity> wrapper);
	
	ZhichufenleiView selectView(@Param("ew") Wrapper<ZhichufenleiEntity> wrapper);
	
}
