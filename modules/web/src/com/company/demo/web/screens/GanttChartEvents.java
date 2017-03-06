package com.company.demo.web.screens;

import com.company.demo.entity.TaskSpan;
import com.haulmont.charts.gui.components.charts.Chart;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.util.Map;
import java.util.UUID;

public class GanttChartEvents extends AbstractWindow {
    @Inject
    private Chart ganttChart;
    @Inject
    private CollectionDatasource<TaskSpan, UUID> taskSpansDs;

    @Override
    public void init(Map<String, Object> params) {
        ganttChart.addGraphItemClickListener(event ->
                openEditor(event.getItem(), WindowManager.OpenType.DIALOG)
                        .addCloseWithCommitListener(() ->
                                taskSpansDs.refresh()));
    }
}