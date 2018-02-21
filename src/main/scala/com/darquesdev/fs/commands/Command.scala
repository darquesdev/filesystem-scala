package com.darquesdev.fs.commands

import com.darquesdev.fs.filesystem.State

trait Command {

  def apply(state: State) : State

}

object Command{

  def from(input: String): Command =
    new UnknownCommand

}

