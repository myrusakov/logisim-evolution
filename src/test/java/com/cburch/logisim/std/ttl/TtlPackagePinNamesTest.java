/*
 * Logisim-evolution - digital logic design tool and simulator
 * Copyright by the Logisim-evolution developers
 *
 * https://github.com/logisim-evolution/
 *
 * This is free software released under GNU GPLv3 license
 */

package com.cburch.logisim.std.ttl;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.cburch.logisim.tools.AddTool;
import org.junit.jupiter.api.Test;

class TtlPackagePinNamesTest {
  @Test
  void everyTtlPackageHasANameForEveryPhysicalPin() {
    for (final var tool : new TtlLibrary().getTools()) {
      final var addTool = assertInstanceOf(AddTool.class, tool);
      final var gate = assertInstanceOf(AbstractTtlGate.class, addTool.getFactory());
      assertTrue(gate.hasCompletePackagePinNames(), gate.getName());
    }
  }
}
