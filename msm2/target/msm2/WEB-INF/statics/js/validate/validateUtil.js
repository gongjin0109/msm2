﻿/* 
用途：检查输入字符串是否为空或者全部都是空格 
输入：str 
返回： 如果全是空返回true,否则返回false 
 */
function isNull(str) {
	if (str == "")
		return true;
	var regu = "^[ ]+$";
	var re = new RegExp(regu);
	return re.test(str);
}

//检查是否为非负浮点数
function isUnsignedNum(str){
    var reg = /^\d+(\.\d+)?$/;
    return reg.test(str);
}

/*
* 用途：检查输入对象的值是否符合整数格式 输入：str 输入的字符串 返回：如果通过验证返回true,否则返回false
*/
function isInteger(str) {
	var regu = /^[-]{0,1}[0-9]{1,}$/;
	return regu.test(str);
}

/*
* 用途：检查输入字符串是否是带小数的数字格式,可以是负数 输入： s：字符串 返回： 如果通过验证返回true,否则返回false
*/
function isDecimal(str) {
	if (isInteger(str))
		return true;
	var re = /^[-]{0,1}(\d+)[\.]+(\d+)$/;
	if (re.test(str)) {
		if (RegExp.$1 == 0 && RegExp.$2 == 0)
			return false;
		return true;
	} else {
		return false;
	}
}

/*
* 用途：检查输入字符串是否符合正整数格式 输入： s：字符串 返回： 如果通过验证返回true,否则返回false
*/
function isNumber(s) {
	var regu = "^[0-9]+$";
	var re = new RegExp(regu);
	if (s.search(re) != -1) {
		return true;
	} else {
		return false;
	}
}

/*
* 用途：检查输入手机号码是否正确 输入： s：字符串 返回： 如果通过验证返回true,否则返回false
*/
function checkMobile(s) {
	var regu = /^0{0,1}(13[0-9]|15[0-9]|18[0-9]|17[0-9])[0-9]{8}$/;
	var re = new RegExp(regu);
	if (re.test(s)) {
		return true;
	} else {
		return false;
	}
}

/* 
用途：检查输入对象的值是否符合E-Mail格式 
输入：str 输入的字符串 
返回：如果通过验证返回true,否则返回false 
*/ 
function isEmail( str ){ 
	var myReg = /^[-_A-Za-z0-9]+@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/; 
	if(myReg.test(str)) 
		return true;
	
	return false; 
} 

/* 
用途：检查输入字符串是否只由英文字母和数字和下划线组成 
输入： 
s：字符串 
返回： 
如果通过验证返回true,否则返回false 
*/
function isNumberOr_Letter(s) {// 判断是否是数字或字母
	var regu = "^[0-9a-zA-Z\_]+$";
	var re = new RegExp(regu);
	if (re.test(s)) {
		return true;
	} else {
		return false;
	}
}

/* 
用途：检查输入字符串是否只由英文字母和数字组成 
输入： 
s：字符串 
返回： 
如果通过验证返回true,否则返回false 
*/ 
function isNumberOrLetter( s ){//判断是否是数字或字母 
	var regu = "^[0-9a-zA-Z]+$"; 
	var re = new RegExp(regu); 
	if (re.test(s)) { 
		return true; 
	}else{ 
		return false; 
	} 
} 

/* 
用途：检查输入字符串是否只由汉字、字母、数字组成 
输入： 
value：字符串 
返回： 
如果通过验证返回true,否则返回false 
*/ 
function isChinaOrNumbOrLett( s ){//判断是否是汉字、字母、数字组成 
	var regu = "^[0-9a-zA-Z\u4e00-\u9fa5]+$"; 
	var re = new RegExp(regu); 
	if (re.test(s)) { 
		return true; 
	}else{ 
		return false; 
	} 
} 

/* 
用途：判断是否是日期 
输入：date：日期；fmt：日期格式 
返回：如果通过验证返回true,否则返回false 
*/ 
function isDate( date, fmt ) { 
	if (fmt==null) 
		fmt="yyyyMMdd"; 
	var yIndex = fmt.indexOf("yyyy"); 
	if(yIndex==-1) 
		return false; 
	var year = date.substring(yIndex,yIndex+4); 
	var mIndex = fmt.indexOf("MM"); 
	if(mIndex==-1) 
		return false; 
	var month = date.substring(mIndex,mIndex+2); 
	var dIndex = fmt.indexOf("dd"); 
	if(dIndex==-1) 
		return false; 
	var day = date.substring(dIndex,dIndex+2); 
	if(!isNumber(year)||year>"2100" || year< "1900") 
		return false; 
	if(!isNumber(month)||month>"12" || month< "01") 
		return false; 
	if(day>getMaxDay(year,month) || day< "01") 
		return false; 
	return true; 
} 

function getMaxDay(year,month) { 
	if(month==4||month==6||month==9||month==11) 
		return "30"; 
	if(month==2) 
		if(year%4==0&&year%100!=0 || year%400==0) 
			return "29"; 
		else 
			return "28";
	return "31"; 
} 

/* 
用途：检查输入的起止日期是否正确，规则为两个日期的格式正确， 
且结束如期>=起始日期 
输入： 
startDate：起始日期，字符串 
endDate：结束如期，字符串 
返回： 
如果通过验证返回true,否则返回false 
*/ 
function checkTwoDate( startDate,endDate ) { 
	if( !isDate(startDate) ) {
		return false; 
	} else if( !isDate(endDate) ) { 
		return false; 
	} else if( startDate > endDate ) { 
		return false; 
	} 
	return true; 
} 

/* 
用途：检查输入的Email信箱格式是否正确 
输入： 
strEmail：字符串 
返回： 
如果通过验证返回true,否则返回false 
*/ 
function checkEmail(strEmail) { 
	var emailReg = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/; 
	if( emailReg.test(strEmail) ){ 
		return true; 
	}else{ 
		return false; 
	} 
} 

/* 
用途：检查输入的电话号码格式是否正确 
输入： 
strPhone：字符串 
返回： 
如果通过验证返回true,否则返回false 
*/ 
function checkPhone( strPhone ) { 
	var phoneRegWithArea = /^[0][1-9]{2,3}-[0-9]{5,10}$/; 
	var phoneRegNoArea = /^[1-9]{1}[0-9]{5,8}$/; 
	if( strPhone.length > 9 ) { 
		if( phoneRegWithArea.test(strPhone) ){ 
			return true; 
		}else{ 
			return false; 
		} 
	}else{ 
		if( phoneRegNoArea.test( strPhone ) ){ 
			return true; 
		}else{ 
			return false; 
		} 
	} 
}
/*
* 字符串是否超出限制长度
*/
function isOverlimit(value, byteLength) { 
	var newvalue = value.replace(/[^\x00-\xff]/g, "**"); 
	if(newvalue.length > byteLength)
		return true;
	else
		return false; 
}

/*
* 判断浮点数
*/
function isFloat(str) {
	if(str=="0.0")
		return true;
	var regu = /^(-?\d+)(\.\d+)?$/;
	return regu.test(str);
}

/*
* 判断非负浮点数
*/
function isNonNegativeFloat(str) {
	if(str=="0.0")
		return true;
	var regu = /^\d+(\.\d+)?$/;
	return regu.test(str);
}

/*
* 判断是否比率值（非负浮点数+小于等于100）
*/
function isRateValue(str) {
	return isNonNegativeFloat(str)&&str<=100;
}

/*
* 用途：检查输入字符串是否符合整数格式 输入： s：字符串 返回： 如果通过验证返回true,否则返回false
*/
function isInterger(s) {
	var regu = "^-?\\d+$";
	var re = new RegExp(regu);
	if (s.search(re) != -1) {
		return true;
	} else {
		return false;
	}
}

//判断是否中文
function isIncludeChinese(val){
    var reg = /.*[\u4e00-\u9fa5]+.*$/;
	if(!reg.test(val)){ 
		return false; 
	}
	return true; 
}

//判断是否符合费率的数字，并且大于等于0，小于等于100
function isRateNumber(val){
	if(isNaN(val)){
		return false;
	}
	if(val<0 || val>100){
		return false;
	}
	return true;
}

//根据身份证获得年龄
function getAgeByIdentityNo(identityNo){
	//身份证15、18位
	if(identityNo.length != 15 && identityNo.length != 18){
		return "";
	}
	var birthYear = 0;
	if(identityNo.length == 15){
		birthYear = identityNo.substring(6,8);
		birthYear = birthYear + 1900;
	}
	if(identityNo.length == 18){
		birthYear = identityNo.substring(6,10);
	}
	var myDate = new Date();
	var curYear = myDate.getFullYear();//当前年份
	var age = curYear - birthYear;
	return age;
}

//根据身份证获得性别(返回1为男，2为女)
function getSexByIdentityNo(identityNo){
	if(identityNo.length != 15 && identityNo.length != 18){
		return "";
	}
	var sex = 0;
	//男为奇数，女为偶数
	if (identityNo.length == 15) {  
		sex = identityNo.substring(14, 15) % 2;  
    } else if (identityNo.length == 18) {  
    	sex = identityNo.substring(14, 17) % 2;  
    }
	if(sex==0){
		sex = 2;
	}
	return sex;
}

//判断是否为空并且是否符合电话格式 str为参数的id，length为参数的最大字符数(为null时不验证)
function isNullAndLengthAndCheckMobile(str,length){
	var strObj = $('#'+str);
	var value = strObj.val(); // 输入框的值
	var msgValue = strObj.siblings("label").text().replace("*","").replace("：",""); // 输入框label的文本值
	if(value==undefined){
		layer.msg("ID不存在");
		strObj.focus();
		return true;
	}
	if(msgValue==""){
		layer.msg("输入框文本值为空");
		strObj.focus();
		return true;
	}
	// 验证不为空
	if(isNull(value)){
		layer.msg("请填写"+msgValue);
		strObj.focus();
		return true;
	}
	// 验证字符长度
	if(length!=null){
		if(value.length>length){
			layer.msg(msgValue+"不能大于"+length+"个字符");
			strObj.focus();
			return true;
		}
	}
	
	if(!checkMobile(value)){
		layer.msg("请填写正确的"+msgValue);
		strObj.focus();
		return true;
	}
	return false;
}

// 判断是否为空并且是否符合整数格式 str为参数的id，length为参数的最大字符数(为null时不验证)
function isNullAndLengthAndIsInteger(str,length){
	var strObj = $('#'+str);
	var value = strObj.val(); // 输入框的值
	var msgValue = strObj.siblings("label").text().replace("*","").replace("：",""); // 输入框label的文本值
	if(value==undefined){
		layer.msg("ID不存在");
		strObj.focus();
		return true;
	}
	if(msgValue==""){
		layer.msg("输入框文本值为空");
		strObj.focus();
		return true;
	}
	// 验证不为空
	if(isNull(value)){
		layer.msg("请填写"+msgValue);
		strObj.focus();
		return true;
	}
	// 验证字符长度
	if(length!=null){
		if(value.length>length){
			layer.msg(msgValue+"不能大于"+length+"个字符");
			strObj.focus();
			return true;
		}
	}
	// 验证是否是整数格式
	if(!isInteger(value)){
		layer.msg("请填写正确的"+msgValue);
		strObj.focus();
		return true;
	}
	return null;
}
//判断是否为空并且是否符合小数格式 str为参数的id，length为参数的最大字符数(为null时不验证)
function isNullAndLengthAndIsDecimal(str,length){
	var strObj = $('#'+str);
	var value = strObj.val(); // 输入框的值
	var msgValue = strObj.siblings("label").text().replace("*","").replace("：",""); // 输入框label的文本值
	if(value==undefined){
		layer.msg("ID不存在");
		strObj.focus();
		return true;
	}
	if(msgValue==""){
		layer.msg("输入框文本值为空");
		strObj.focus();
		return true;
	}
	// 验证不为空
	if(isNull(value)){
		layer.msg("请填写"+msgValue);
		strObj.focus();
		return true;
	}
	// 验证字符长度
	if(length!=null){
		if(value.length>length){
			layer.msg(msgValue+"不能大于"+length+"个字符");
			strObj.focus();
			return true;
		}
	}
	// 验证是否是小数格式
	if(!isDecimal(value)){
		layer.msg("请填写正确的"+msgValue);
		strObj.focus();
		return true;
	}
	return false;
}

// 判断是否为空并且长度不大于 str为参数的id，length为参数的最大字符数(为null时不验证)
function isNullAndLength(str,length){
	var strObj = $('#'+str);
	var value = strObj.val(); // 输入框的值
	var msgValue = strObj.siblings("label").text().replace("*","").replace("：",""); // 输入框label的文本值
	if(value==undefined){
		layer.msg("ID不存在");
		strObj.focus();
		return true;
	}
	if(msgValue==""){
		layer.msg("输入框文本值为空");
		strObj.focus();
		return true;
	}
	
	// 验证不为空
	if(isNull(value)){
		layer.msg("请填写"+msgValue);
		strObj.focus();
		return true;
	}
	// 验证字符长度
	if(length!=null){
		if(value.length>length){
			layer.msg(msgValue+"不能大于"+length+"个字符");
			strObj.focus();
			return true;
		}
	}
	return false;
}