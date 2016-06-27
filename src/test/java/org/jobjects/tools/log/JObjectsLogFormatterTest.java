/**
 * 
 */
package org.jobjects.tools.log;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.enterprise.poc.Application;
import com.enterprise.poc.ihm.Visualisation;
import com.enterprise.poc.jap.MaPersisance;

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
    JObectsLogFilterConfiguration.getInstance().show();
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
    Application app = new Application();
    app.methodeC();
    Visualisation visu = new Visualisation();
    visu.methodeB();
    MaPersisance pers = new MaPersisance();
    pers.methodeA();
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

  @Test
  public void testLogRecord() {
    JObjectsLogFormatter.initializeLogging();
    LOGGER.entering(getClass().getName(), "testLogRecord => LOGGER.entering");

    LOGGER.finest("Le mega fin.");
    LOGGER.finer("Le plus fin.");
    LOGGER.fine("Le fin.");
    LOGGER.config("Mode configuration");
    LOGGER.info("Dernière news !");
    LOGGER.warning("Attention");
    LOGGER.severe("Une exception en text court.");
    IllegalArgumentException iae = new IllegalArgumentException("Tout va bien. !!!! Exception désirée afin de montrer sa trace dans les logs !!!!");
    LOGGER.log(Level.SEVERE, iae.getMessage(), iae);

    LOGGER.exiting(getClass().getName(), "testLogRecord => LOGGER.exiting");
  }

}
