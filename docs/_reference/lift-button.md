---
title: Lift Button Requirements
nav_order: 1
---

# Lift Button

The Lift Button requirements specification.
{: .fs-6 .fw-300 }

Write the brains of a lift button.
- When you press the button, the light comes on.
- When the lift arrives and the doors
  open, the light goes out.
- Pressing the button again while the light is on but the lift doors are closed has no effect.
- While the doors are open, pressing the button does not switch the light on.

This is a state diagram:

![State Diagram]({{ '/assets/images/explanation/lift_button_states_transitions.png' | relative_url }})
