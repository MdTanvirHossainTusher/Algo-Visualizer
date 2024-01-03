package algoVisualizer.panels;

import algoVisualizer.VariablesManager;
import algoVisualizer.canvas.GraphCanvas;

import java.awt.*;

public class GraphPanel {

//    private GraphCanvas canvas = VariablesManager.getCanvas();
    private GraphCanvas canvas;
//    private static Container container;
    public Container graphPanelInitialization(Container container) {
        /* ---------------  Graph & Compare Panel Start  --------------- */

        canvas = new GraphCanvas();
        canvas.setBounds(155, 5, 780, 680);
        container.add(canvas);
//        VariablesManager.getContainer().add(canvas);

        return container;
        /* ---------------  Graph & Compare Panel Start  --------------- */
    }

}
