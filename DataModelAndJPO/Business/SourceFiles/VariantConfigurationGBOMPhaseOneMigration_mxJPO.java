/*
 * VariantConfigurationGBOMPhaseOneMigration.java program to migrate Inclusion Rule on GBOM to Effectivity of found Logical Feature/Products.
 *
 * Copyright (c) 1992-2018 Dassault Systemes.
 *
 * All Rights Reserved.
 * This program contains proprietary and trade secret information of
 * MatrixOne, Inc.  Copyright notice is precautionary only and does
 * not evidence any actual or intended publication of such program.
 *
 */

import matrix.db.*;


public class VariantConfigurationGBOMPhaseOneMigration_mxJPO extends
		VariantConfigurationGBOMPhaseOneMigrationBase_mxJPO {
    /**
     *
     * @param context
     *            the eMatrix <code>Context</code> object
     * @param args
     *            holds no arguments
     * @throws Exception
     *             if the operation fails
     * @since FTR V6R2012x
     */
    public VariantConfigurationGBOMPhaseOneMigration_mxJPO(Context context,
            String[] args) throws Exception {
        super(context, args);
    }

}
