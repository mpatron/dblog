package org.jobjects.tools.log;

import java.io.File;

public class JObectsLogFilterConfiguration {

  private static JObectsLogFilterConfiguration INSTANCE = new JObectsLogFilterConfiguration();

  protected JObectsLogFilterConfiguration() {
  }

  /** Point d'accès pour l'instance unique du singleton */
  public static JObectsLogFilterConfiguration getInstance() {
    return INSTANCE;
  }

  public void show() {
    String fname = System.getProperty("java.util.logging.config.file");
    String cname = System.getProperty("java.util.logging.config.class");
    try {
      if (fname == null) {
        fname = System.getProperty("java.home");
        if (fname == null) {
          throw new Error("Can't find java.home ??");
        }
        File f = new File(fname, "lib");
        f = new File(f, "logging.properties");
        fname = f.getCanonicalPath();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("cname = " + cname + " fname = " + fname);
  }

}
