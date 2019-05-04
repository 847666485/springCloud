/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.itmayiedu.api.fallback;

import org.springframework.stereotype.Component;

import com.itmayiedu.api.entity.UserEntity;
import com.itmayiedu.api.feign.MemberServiceFeigin;
import com.itmayiedu.api.service.IMemberService;
import com.itmayiedu.base.BaseApiService;
import com.itmayiedu.base.ResponseBase;

/**
 * 功能说明: <br>
 * 创建作者:每特教育-余胜军<br>
 * 创建时间:2018年9月11日 下午7:08:23<br>
 * 教育机构:每特教育|蚂蚁课堂<br>
 * 版权说明:上海每特教育科技有限公司版权所有<br>
 * 官方网站:www.itmayiedu.com|www.meitedu.com<br>
 * 联系方式:qq644064779<br>
 * 注意:本内容有每特教育学员共同研发,请尊重原创版权
 */
@Component
public class MemberFallback extends BaseApiService implements MemberServiceFeigin {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itmayiedu.api.service.IMemberService#getMember(java.lang.String)
	 */
	@Override
	public UserEntity getMember(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itmayiedu.api.service.IMemberService#getUserInfo()
	 */
	@Override
	public ResponseBase getUserInfo() {

		return setResultError("服务器忙,请稍后重试!");
	}

	@Override
	public UserEntity getMember1(String name) {
		return null;
	}

}
