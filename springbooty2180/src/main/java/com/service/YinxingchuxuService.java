package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinxingchuxuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinxingchuxuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinxingchuxuView;


/**
 * 银行储蓄
 *
 * @author 
 * @email 
 * @date 2021-04-14 10:48:37
 */
public interface YinxingchuxuService extends IService<YinxingchuxuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinxingchuxuVO> selectListVO(Wrapper<YinxingchuxuEntity> wrapper);
   	
   	YinxingchuxuVO selectVO(@Param("ew") Wrapper<YinxingchuxuEntity> wrapper);
   	
   	List<YinxingchuxuView> selectListView(Wrapper<YinxingchuxuEntity> wrapper);
   	
   	YinxingchuxuView selectView(@Param("ew") Wrapper<YinxingchuxuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinxingchuxuEntity> wrapper);
   	
}

