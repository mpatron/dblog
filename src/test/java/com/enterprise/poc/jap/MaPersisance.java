package com.enterprise.poc.jap;

import java.util.logging.Logger;

public class MaPersisance {
  private static Logger LOGGER = Logger.getLogger(MaPersisance.class.getCanonicalName());

  public MaPersisance() {
    LOGGER.info("new MaPersisance");
  }

  public void methodeA() {
    LOGGER.info("call methodeA");
  }
}
