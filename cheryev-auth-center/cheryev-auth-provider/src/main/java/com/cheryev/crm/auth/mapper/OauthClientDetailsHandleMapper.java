package com.cheryev.crm.auth.mapper;

import com.cheryev.crm.auth.model.OauthClientDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OauthClientDetailsHandleMapper {

    List<OauthClientDetails> getAllDetails();

}
