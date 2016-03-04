package io.github.liias.monkey.project.ui.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import io.github.liias.monkey.project.module.MonkeyModuleBuilder;

import javax.swing.*;

public class MonkeyModuleWizardStep extends ModuleWizardStep {
  private final MonkeyAppPropertiesEditor myAppPropertiesEditor;

  private JPanel myPanel;

  public MonkeyModuleWizardStep(MonkeyModuleBuilder moduleBuilder, WizardContext context) {
    myAppPropertiesEditor = new MonkeyAppPropertiesEditor(moduleBuilder.getName(), context.getModulesProvider());

    myPanel = new JPanel();
    myPanel.setLayout(new OverlayLayout(myPanel));
    myPanel.add(myAppPropertiesEditor.getContentPanel());
  }

  @Override
  public JComponent getComponent() {
    return myPanel;

  }

  @Override
  public void updateDataModel() {

  }
}