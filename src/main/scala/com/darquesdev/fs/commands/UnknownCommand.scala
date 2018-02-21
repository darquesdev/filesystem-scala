package com.darquesdev.fs.commands
import com.darquesdev.fs.filesystem.State

class UnknownCommand extends Command {
  override def apply(state: State): State =
    state.setMessage("Command not found!")
}
