/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.itmayiedu.api.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.api.entity.UserEntity;
import com.itmayiedu.api.service.IMemberService;
import com.itmayiedu.base.BaseApiService;
import com.itmayiedu.base.ResponseBase;

/**
 * 功能说明: <br>
 * 创建作者:每特教育-余胜军<br>
 * 创建时间:2018年9月6日 下午10:20:41<br>
 * 教育机构:每特教育|蚂蚁课堂<br>
 * 版权说明:上海每特教育科技有限公司版权所有<br>
 * 官方网站:www.itmayiedu.com|www.meitedu.com<br>
 * 联系方式:qq644064779<br>
 * 注意:本内容有每特教育学员共同研发,请尊重原创版权
 */
@RestController
public class MemberServiceImpl extends BaseApiService implements IMemberService {
	@Value("${server.port}")
	private String serverPort;

	@RequestMapping("/getMember")
	public UserEntity getMember(@RequestParam("name") String name) {
		UserEntity userEntity = new UserEntity();
		userEntity.setName(name + "   端口号:" + serverPort);
		userEntity.setAge(20);
		return userEntity;
	}

	@RequestMapping("/getUserInfo")
	public ResponseBase getUserInfo() {
		System.out.println(" 我是会员服务,会员服务调用订单服务开始啦！！");
		return setResultSuccess("订单服务接口调用会员服务接口成功....");
	}

	@Override
	public UserEntity getMember1(String name) {
		return null;
	}

}
