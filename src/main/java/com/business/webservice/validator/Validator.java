package com.business.webservice.validator;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

@Service
public class Validator {
	
	public void numericNullCheck(Integer id)
	{
		if(null==id)
		{
			throw new RestClientException("Invalid Id");
		}
	}

}
