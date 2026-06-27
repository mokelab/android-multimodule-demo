package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data071RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data072RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data073RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data074RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data075RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data076RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data077RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data078RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data079RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data080RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen008ViewModel @Inject constructor(
    private val repo1: Data071RepositoryImpl,
    private val repo2: Data072RepositoryImpl,
    private val repo3: Data073RepositoryImpl,
    private val repo4: Data074RepositoryImpl,
    private val repo5: Data075RepositoryImpl,
    private val repo6: Data076RepositoryImpl,
    private val repo7: Data077RepositoryImpl,
    private val repo8: Data078RepositoryImpl,
    private val repo9: Data079RepositoryImpl,
    private val repo10: Data080RepositoryImpl,

): ViewModel() {
}
