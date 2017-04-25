package com.reihane.dp.proxy;

public class CommandExecutorProxy implements CommandExecutor {
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd){
		if("Admin".equals(user) && "123".equals(pwd)) 
			isAdmin=true;
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void executeCommand(String cmd) throws Exception {
		if(isAdmin){
			executor.executeCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.executeCommand(cmd);
			}
		}
	}
}
