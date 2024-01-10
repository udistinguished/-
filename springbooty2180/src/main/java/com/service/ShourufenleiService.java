package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShourufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShourufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShourufenleiView;


/**
 * 收入分类
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface ShourufenleiService extends IService<ShourufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShourufenleiVO> selectListVO(Wrapper<ShourufenleiEntity> wrapper);
   	
   	ShourufenleiVO selectVO(@Param("ew") Wrapper<ShourufenleiEntity> wrapper);
   	
   	List<ShourufenleiView> selectListView(Wrapper<ShourufenleiEntity> wrapper);
   	
   	ShourufenleiView selectView(@Param("ew") Wrapper<ShourufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShourufenleiEntity> wrapper);
   	
}

