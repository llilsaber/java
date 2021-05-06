<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="person">
   <insert id="insert" parameterType="personVO">
      insert into PERSON values (#{ID}, #{FIRST_NAME}, #{LAST_NAME}, #{EMAIL}, #{GENDER}, #{PHONE})
   </insert>
</mapper>