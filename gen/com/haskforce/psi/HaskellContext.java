// This is a generated file. Not intended for manual editing.
package com.haskforce.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellContext extends PsiElement {

  @NotNull
  List<HaskellAtype> getAtypeList();

  @Nullable
  PsiElement getTilde();

}
