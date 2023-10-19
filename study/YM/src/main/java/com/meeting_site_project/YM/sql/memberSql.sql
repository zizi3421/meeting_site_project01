create table member (
userId  nvarchar2(100) primary key,
userName nvarchar2(100),
userPicture nvarchar2(100),
userMbti nvarchar2(10),
userPassword nvarchar2(100),
userInfo nvarchar2(500) default null,
userAdmin number default 0,
birthday nvarchar2(50),
nickName nvarchar2(50),
emailId nvarchar2(50),
emailDomain nvarchar2(50),
signDate date default sysdate
);

CREATE TABLE group (
groupId nvarchar2(30) PRIMARY KEY,
sidoCode nvarchar2(30),
sigoonCode nvarchar2(30),
groupName nvarchar2(30),
groupInfo nvarchar2(100),
groupNumberOfPeople number,
group_picture nvarchar2(100)
);