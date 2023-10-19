create table member (
userId  nvarchar2(100) primary key,
userName nvarchar2(100),
userPicture nvarchar2(100),
userMbti nvarchar2(10),
userPassword nvarchar2(100),
userInfo nvarchar2(500) default null,
userAdmin number default 0,
birthday nvarchar2(100),
nickName nvarchar2(50),
emailId nvarchar2(50),
emailDomain nvarchar2(50)
);