/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.dao;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.dao
 * FileName:BackDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午6:08:03
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class BackDAO extends BaseDAO{

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午9:47:55
	 * Description
	 * @param assetId
	 * @param remark
	 * @return
	 */
	//@Insert("insert into BackTable values(#{id},default,#{remark}) ")
	public int insertBackInfo(int id, String remark){
		return 1;
	}

}
