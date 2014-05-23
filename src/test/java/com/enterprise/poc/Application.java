package com.enterprise.poc;

import java.util.logging.Logger;

public class Application {
  private static Logger LOGGER = Logger.getLogger(Application.class.getCanonicalName());

  public Application() {
    LOGGER.info("new MaPersisance");
  }

  public void methodeC() {
    LOGGER.info("call methodeB");
  }
}
