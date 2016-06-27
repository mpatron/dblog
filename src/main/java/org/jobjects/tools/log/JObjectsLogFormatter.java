package org.jobjects.tools.log;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class JObjectsLogFormatter extends Formatter {
  public final static String ISO8601DATEFORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
  public final static String VERYSMAL = "h:mm:ss";
  private static final DateFormat format = new SimpleDateFormat(ISO8601DATEFORMAT);

  /**
   * Attention, il faut rendre la methode appelable 1 fois.
   */
  public static void initializeLogging() {
    final String filePathnameLogging = "/org/jobjects/tools/log/logging.properties";
    try (InputStream is = JObjectsLogFormatter.class.getResourceAsStream(filePathnameLogging)) {
      LogManager.getLogManager().readConfiguration(is);
      Logger.getLogger(JObjectsLogFormatter.class.getName()).config("Chargement realisé de " + filePathnameLogging);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public String format(LogRecord record) {
    String loggerName = record.getLoggerName();
    if (loggerName == null) {
      loggerName = "root";
    }

    StringBuilder output = new StringBuilder().append(StringUtils.rightPad("[" + record.getLevel().getName() + "]", 9))
        // .append(Thread.currentThread().getName()).append('|')
        // .append(" ").append(loggerName).append(" ")
        .append(" " + format.format(new Date(record.getMillis()))).append(" : ").append("..."
            + StringUtils.substringAfterLast(record.getSourceClassName(), "org.jobjects.") + "." + record.getSourceMethodName() + "()")
        .append(" : ");

    if (record.getParameters() != null) {
      output.append(MessageFormat.format(record.getMessage(), record.getParameters()));
    } else {
      output.append(record.getMessage());
    }

    if (record.getThrown() != null) {
      output.append(System.lineSeparator());
      output.append(ExceptionUtils.getStackTrace(record.getThrown()));
    }

    output.append(System.lineSeparator());
    return output.toString();
  }
}
