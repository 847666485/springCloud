/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.itmayiedu.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itmayiedu.api.entity.UserEntity;
import com.itmayiedu.base.ResponseBase;

/**
 * 功能说明: <br>
 * 创建作者:每特教育-余胜军<br>
 * 创建时间:2018年9月6日 下午10:15:28<br>
 * 教育机构:每特教育|蚂蚁课堂<br>
 * 版权说明:上海每特教育科技有限公司版权所有<br>
 * 官方网站:www.itmayiedu.com|www.meitedu.com<br>
 * 联系方式:qq644064779<br>
 * 注意:本内容有每特教育学员共同研发,请尊重原创版权
 */
public interface IMemberService {

	// 实体类是存放接口项目还是 存放在实现项目 实体类存放在接口项目里面
	// 实体类和定义接口信息存放在接口项目
	// 代码实现存放在接口实现类里面

	@RequestMapping("/getMember")
	public UserEntity getMember(@RequestParam("name") String name);

	@RequestMapping("/getUserInfo")
	public ResponseBase getUserInfo();

	@RequestMapping("/getMember1")
	public UserEntity getMember1(@RequestParam("name") String name);

}
