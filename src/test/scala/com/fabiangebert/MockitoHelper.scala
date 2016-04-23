package com.fabiangebert

import org.mockito.stubbing.Stubber
import org.mockito.verification.VerificationMode

import scala.reflect.Manifest

trait MockitoHelper {
  def matches[T](t: T) = org.mockito.Matchers.eq(t)

  def any[T <: AnyRef](implicit manifest: Manifest[T]): T = {
    org.mockito.Matchers.any(manifest.runtimeClass.asInstanceOf[Class[T]])
  }

  def spy[T <: AnyRef](implicit manifest: Manifest[T]): T = {
    org.mockito.Mockito.spy(manifest.runtimeClass.asInstanceOf[Class[T]])
  }

  def spy[T](t: T) = {
    org.mockito.Mockito.spy(t)
  }

  def doReturn(t: Any): Stubber = org.mockito.Mockito.doReturn(t)
  def doThrow(t: Throwable): Stubber = org.mockito.Mockito.doThrow(t)

  def verify[T](mock: T) = org.mockito.Mockito.verify(mock)
  def verify[T](mock: T, mode: VerificationMode) = org.mockito.Mockito.verify(mock, mode)

  def never = org.mockito.Mockito.never()
}
