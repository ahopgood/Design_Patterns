package com.alexander.threading.executors;

import java.util.concurrent.Executor;

public class SimpleExecutor implements Executor {

	@Override
	public void execute(Runnable command) {
		command.run();
	}

}
