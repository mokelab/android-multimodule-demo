package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data791RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data792RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data793RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data794RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data795RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data796RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data797RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data798RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data799RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data800RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen080ViewModel @Inject constructor(
    private val repo1: Data791RepositoryImpl,
    private val repo2: Data792RepositoryImpl,
    private val repo3: Data793RepositoryImpl,
    private val repo4: Data794RepositoryImpl,
    private val repo5: Data795RepositoryImpl,
    private val repo6: Data796RepositoryImpl,
    private val repo7: Data797RepositoryImpl,
    private val repo8: Data798RepositoryImpl,
    private val repo9: Data799RepositoryImpl,
    private val repo10: Data800RepositoryImpl,

): ViewModel() {
}
