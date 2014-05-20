/**
 * 
 */
package org.jobjects.tools.log;

import static org.junit.Assert.fail;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Mickael
 *
 */
public class JObjectsLogFormatterTest {

  private static Logger LOGGER = Logger.getLogger(JObjectsLogFormatterTest.class.getCanonicalName());
  
  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    LOGGER.info("setUpBeforeClass()");
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    LOGGER.info("setUpBeforeClass()");
  }

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    LOGGER.info("setUpBeforeClass()");
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
    LOGGER.info("setUpBeforeClass()");
  }

  /**
   * Test method for {@link org.jobjects.tools.log.JObjectsLogFormatter#format(java.util.logging.LogRecord)}.
   */
  @Test
  public void testFormatLogRecord() {
    LOGGER.severe("setUpBeforeClass()");
  }

  /**
   * Test method for {@link org.jobjects.tools.log.JObjectsLogFormatter#stackTraceToString(java.lang.Throwable)}.
   */
  @Test
  public void testStackTraceToString() {
    LOGGER.severe("setUpBeforeClass()");
  }

  /**
   * Test method for {@link java.util.logging.Formatter#format(java.util.logging.LogRecord)}.
   */
  @Test
  public void testFormatLogRecord1() {
    LOGGER.severe("setUpBeforeClass()");
  }

  /**
   * Test method for {@link java.util.logging.Formatter#getHead(java.util.logging.Handler)}.
   */
  @Test
  public void testGetHead() {
    LOGGER.severe("setUpBeforeClass()");
  }

  /**
   * Test method for {@link java.util.logging.Formatter#getTail(java.util.logging.Handler)}.
   */
  @Test
  public void testGetTail() {
    LOGGER.severe("setUpBeforeClass()");
  }

  /**
   * Test method for {@link java.util.logging.Formatter#formatMessage(java.util.logging.LogRecord)}.
   */
  @Test
  public void testFormatMessage() {
    LOGGER.severe("setUpBeforeClass()");
  }

}
