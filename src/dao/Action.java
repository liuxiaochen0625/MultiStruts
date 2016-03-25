package dao;

public interface Action {
	public final static String SUCCESSED = "success"; 
	public final static String ERROR = "error"; 
	public final static String INPUT = "input"; 
	public final static String LOGIN = "login"; 
	public final static String NONE = "none"; 
	public String execute();
}
