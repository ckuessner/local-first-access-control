package com.github.ckuessner.ardt.base

trait Bottom[T] {
  val empty: T
  def isEmpty(value: T): Boolean = value == empty
}
