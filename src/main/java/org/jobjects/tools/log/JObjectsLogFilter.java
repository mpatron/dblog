package org.jobjects.tools.log;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class JObjectsLogFilter implements Filter {

  @Override
  public boolean isLoggable(LogRecord record) {    
    return (record != null && record.getSourceClassName().startsWith("org.jobjects"));
  }

}
