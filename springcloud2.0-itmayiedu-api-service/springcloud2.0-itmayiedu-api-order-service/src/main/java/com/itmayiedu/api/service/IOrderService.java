/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.itmayiedu.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

import com.itmayiedu.base.ResponseBase;

/**
 * 功能说明: <br>
 * 创建作者:每特教育-余胜军<br>
 * 创建时间:2018年9月6日 下午10:29:44<br>
 * 教育机构:每特教育|蚂蚁课堂<br>
 * 版权说明:上海每特教育科技有限公司版权所有<br>
 * 官方网站:www.itmayiedu.com|www.meitedu.com<br>
 * 联系方式:qq644064779<br>
 * 注意:本内容有每特教育学员共同研发,请尊重原创版权
 */
public interface IOrderService {

	// 订单服务调用会员服务接口信息 feign
	@RequestMapping("/orderToMember")
	public String orderToMember(String name);

	// 订单服务接口调用会员服务接口
	@RequestMapping("/orderToMemberUserInfo")
	public ResponseBase orderToMemberUserInfo();

	// 订单服务接口
	@RequestMapping("/orderInfo")
	public ResponseBase orderInfo();
}
