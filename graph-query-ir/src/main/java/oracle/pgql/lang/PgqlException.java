/*
 * Copyright (C) 2013 - 2018 Oracle and/or its affiliates. All rights reserved.
 */
package oracle.pgql.lang;

public class PgqlException extends Exception {

  public PgqlException(Throwable cause) {
    super(cause);
  }

  public PgqlException(String msg) {
    super(msg);
  }

  public PgqlException(String msg, Throwable cause) {
    super(msg, cause);
  }
}