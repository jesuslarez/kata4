package kata4.view;

import kata4.model.Histogram;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Jesus Larez
 */
public class HistogramDisplay extends ApplicationFrame{
    private final Histogram histogram;
    public HistogramDisplay(Histogram histogram) {
        super("Histogram");
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel() {
       ChartPanel chart = new ChartPanel(createChart(CreateDataSet()));
       chart.setPreferredSize(new Dimension(500,400));
       return chart;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma", 
                "Dominios email", "Numero de emails", dataSet, 
                PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset CreateDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for(Object key : histogram.keySet())
            dataSet.addValue(this.histogram.get(key), "", key.toString());
        
        return dataSet;
    }
    
}
