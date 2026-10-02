/*
 * Logisim-evolution - digital logic design tool and simulator
 * Copyright by the Logisim-evolution developers
 *
 * https://github.com/logisim-evolution/
 *
 * This is free software released under GNU GPLv3 license
 */

package com.cburch.logisim.std.ttl;

final class TtlPinNames {
  static final String[] QUAD_2_INPUT = {
    "1A", "1B", "1Y", "2A", "2B", "2Y", "3Y", "3A", "3B", "4Y", "4A", "4B"
  };

  static final String[] QUAD_2_INPUT_7402 = {
    "1Y", "1A", "1B", "2Y", "2A", "2B", "3A", "3B", "3Y", "4A", "4B", "4Y"
  };

  static final String[] HEX_SINGLE_INPUT = {
    "1A", "1Y", "2A", "2Y", "3A", "3Y", "4Y", "4A", "5Y", "5A", "6Y", "6A"
  };

  static final String[] TRIPLE_3_INPUT = {
    "1A", "1B", "2A", "2B", "2C", "2Y", "3Y", "3A", "3B", "3C", "1Y", "1C"
  };

  static final String[] QUAD_3_STATE_BUFFER = {
    "n1OE", "1A", "1Y", "n2OE", "2A", "2Y", "3Y", "3A", "n3OE", "4Y", "4A", "n4OE"
  };

  private TtlPinNames() {}
}
