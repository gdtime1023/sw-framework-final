package com.swfinal.register;

import java.util.Map;

public interface RegisterMapper {

	int insertMember(Map<String, Object> params);

	int selectMemberDuplicateCount(Map<String, Object> params);

	Map<String, Object> selectMemberInfo(Map<String, Object> params);

	int updateMember(Map<String, Object> params);

	int deleteMember(Map<String, Object> params);

}
