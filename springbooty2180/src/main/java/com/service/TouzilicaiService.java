package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TouzilicaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TouzilicaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TouzilicaiView;


/**
 * 投资理财
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface TouzilicaiService extends IService<TouzilicaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TouzilicaiVO> selectListVO(Wrapper<TouzilicaiEntity> wrapper);
   	
   	TouzilicaiVO selectVO(@Param("ew") Wrapper<TouzilicaiEntity> wrapper);
   	
   	List<TouzilicaiView> selectListView(Wrapper<TouzilicaiEntity> wrapper);
   	
   	TouzilicaiView selectView(@Param("ew") Wrapper<TouzilicaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TouzilicaiEntity> wrapper);
   	
}

