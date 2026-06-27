package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data901RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data902RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data903RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data904RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data905RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data906RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data907RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data908RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data909RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data910RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen091ViewModel @Inject constructor(
    private val repo1: Data901RepositoryImpl,
    private val repo2: Data902RepositoryImpl,
    private val repo3: Data903RepositoryImpl,
    private val repo4: Data904RepositoryImpl,
    private val repo5: Data905RepositoryImpl,
    private val repo6: Data906RepositoryImpl,
    private val repo7: Data907RepositoryImpl,
    private val repo8: Data908RepositoryImpl,
    private val repo9: Data909RepositoryImpl,
    private val repo10: Data910RepositoryImpl,

): ViewModel() {
}
