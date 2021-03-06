package org.jpos.jposext.jposworkflow.eclipse.figure;

import java.awt.Color;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.FanRouter;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.widgets.Display;

/**
 * @author dgrandemange
 *
 */
public class EdgeFigure extends PolylineConnection {
	
	private static final Color DEFAULT_EDGE_COLOR = Color.BLACK;
	
    public EdgeFigure() {
		ConnectionRouter cr = new FanRouter();
		this.setConnectionRouter(cr);
		
		PolygonDecoration decoration = new PolygonDecoration();
		this.setTargetDecoration(decoration);
		
		org.eclipse.swt.graphics.Color fg = new org.eclipse.swt.graphics.Color(
				Display.getCurrent(), DEFAULT_EDGE_COLOR.getRed(), DEFAULT_EDGE_COLOR.getGreen(), DEFAULT_EDGE_COLOR.getBlue());
		this.setForegroundColor(fg);
				
    }
}
