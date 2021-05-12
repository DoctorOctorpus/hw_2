package hw_2;

public class User {
	public User(int _userId,String _userName,String _userInfo, String _userCourse) {
		this._userId = _userId;
		this._userName = _userName;
		this._userInfo = _userInfo;
		this._userCourse = _userCourse;
	}
	private int _userId;
	private String _userName;
	private String _userInfo;
	private String _userCourse;
	
	public int get_userId() {
		return _userId;
	}
	public void set_userId(int _userId) {
		this._userId = _userId;
	}
	public  String get_userName() {
		return _userName;
	}
	public void set_userName(String _userName) {
		this._userName = _userName;
	}
	public String get_userInfo() {
		return _userInfo;
	}
	public void set_userInfo(String _userInfo) {
		this._userInfo = _userInfo;
	}
	public String get_userCourse() {
		return _userCourse;
	}
	public void set_userCourse(String _userCourse) {
		this._userCourse = _userCourse;
	}
	
	
		
	
	
}
