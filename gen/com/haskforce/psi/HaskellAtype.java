// This is a generated file. Not intended for manual editing.
package com.haskforce.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellAtype extends PsiElement {

  @Nullable
  HaskellQtycon getQtycon();

  @NotNull
  List<HaskellTypee> getTypeeList();

  @Nullable
  HaskellTyvar getTyvar();

}
