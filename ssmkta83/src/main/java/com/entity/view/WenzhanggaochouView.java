package com.entity.view;

import com.entity.WenzhanggaochouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文章稿酬
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-20 17:28:22
 */
@TableName("wenzhanggaochou")
public class WenzhanggaochouView  extends WenzhanggaochouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhanggaochouView(){
	}
 
 	public WenzhanggaochouView(WenzhanggaochouEntity wenzhanggaochouEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhanggaochouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
